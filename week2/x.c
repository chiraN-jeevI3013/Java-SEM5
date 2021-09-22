s1.c
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<errno.h>
#include<string.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<string.h>
                                                                                                                                                                                                                                                                                               
int main(){
                                                                                                                                                                                                                                                                                               
    int domain = AF_INET;
    int type = SOCK_STREAM;
    int protocol = 0;
                                                                                                                                                                                                                                                                                            
    int sockfd = socket(domain, type, protocol);
                                                                                                                                                                                                                                                                                            
    if(sockfd == -1){
            perror("socket");
            exit(1);
    }                                                                                                                                                                                                                                                                                      
    else
            printf("Socket: %d\n", sockfd);
                                                                                                                                                                                                                                                                                            
    int p = 1;
    if(setsockopt(sockfd, SOL_SOCKET, SO_REUSEADDR|SO_REUSEPORT, &p, sizeof(p))==-1){
            perror("setsockopt");
            shutdown(sockfd, 2);
            close(sockfd);                                                                                                                                                                                                                                                                 
            exit(1);
    }                                                                                                                                                                                                                                                                                      
    struct sockaddr_in sa;
                                                                                                                                                                                                                                                                                            
    sa.sin_family = AF_INET;                                                                                                                                                                                                                                                               
    sa.sin_port = htons(33580);
    sa.sin_addr.s_addr = INADDR_ANY;                                                                                                                                                                                                                                                       
    memset(&(sa.sin_zero), '\0', 8);
                                                                                                                                                                                                                                                                                            
    if(bind(sockfd, (struct sockaddr*)&sa, sizeof(struct sockaddr_in)) == -1){
            perror("bind");
            shutdown(sockfd, 2);
            close(sockfd);                                                                                                                                                                                                                                                                 
            exit(1);
    }                                                                                                                                                                                                                                                                                      
    else
            printf("Port successfully bound to socket\n");
                                                                                                                                                                                                                                                                                            
    int backlog = 10;
                                                                                                                                                                                                                                                                                            
    if(listen(sockfd, backlog)==-1){
            perror("listen");
            shutdown(sockfd, 2);
            close(sockfd);                                                                                                                                                                                                                                                                 
            exit(1);
    }                                                                                                                                                                                                                                                                                      
    else
            printf("Actively listening for connections\n");
                                                                                                                                                                                                                                                                                            
    struct sockaddr_in ca;
    int addrlen = sizeof(struct sockaddr_in);
    int csd;
    while(1)
    {
            printf("\n");
            fflush(stdout);
        while(1)
        {
            if((csd=accept(sockfd,(struct sockaddr*)&ca, &addrlen))==-1){
                    continue;
            }                                                                                                                                                                                                                                                                      
            printf("Connected to %s\n" , inet_ntoa(ca.sin_addr));
            break;
        }                                                                                                                                                                                                                                                                              
            
        while(1)
        {
            fflush(stdout);
            char str[1024]={0}, buf[1024]={0};
            while(1)
            {
                if(recv(csd, buf, 1024, 0)==-1){
                    continue;
                }                                                                                                                                                                                                                                                      
                printf("Server: Message received from client: %s", buf);
                break;
            }                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                            
            if(strcmp(buf,"bye\n")==0)
                    break;
            while(1)
            {
                printf("Enter message to be sent to client: ");
                fgets(str,1024,stdin);
                if((send(csd, str, strlen(str), 0))==-1){
                        continue;
                }                                                                                                                                                                                                                                                      
                printf("Server: Message sent\n");
                break;
            }                                                                                                                                                                                                                                                              
            if(strcmp(str,"bye\n")==0)
                break;
        }                                                                                                                                                                                                                                                                      
    }                                                                                                                                                                                                                                                                              
    shutdown(sockfd,2);                                                                                                                                                                                                                                                                    
    close(sockfd);                                                                                                                                                                                                                                                                         
    shutdown(csd,2);                                                                                                                                                                                                                                                                       
    close(csd);                                                                                                                                                                                                                                                                            

    return 0;                        
}