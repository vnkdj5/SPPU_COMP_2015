/*
 ============================================================================
 Name        : Linux.c
 Author      : Vaibhav
 Version     : 1.4
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include<unistd.h>
int main(void) {
	int choice;
	char *args[]={"ps",NULL};
	pid_t pid1,pid2;
	char *command[]={"ls",NULL};
	int pid;
	int status;
	char *join[]={"join","file1","file2",NULL};
	puts("UNIX COMMANDS EXECUTION");
	do
	{
		printf("Menu\n1.PS\n2.JOIN\n3.FORK\n4.WAIT\n5.Exec\n0.Exit\nENter Your choice:");
		scanf("%d",&choice);
		switch(choice)
		{
		case 1:

			execvp(args[0],args);
			break;
		case 2:
			execvp(join[0],join);
			break;
		case 3:
			printf("FoRK AND WAIT DEMO\n");
			printf("Parent %d\n",getpid());


			pid1=fork();
			//pid2=fork();
			if(pid1==0)
			{
				printf(" 1 Child Forked Process :%d\n",getpid());
				sleep(2);
				printf("1 CHILD EXIT \n");
				exit(1);
			}
			/*if(pid2==0)
			{
				printf("2 Child Forked Process :%d\n",getpid());
				sleep(2);
				printf("2 CHILD EXIT\n");
				//exit(1);
			}*/
			printf("PID AT END %d",getpid());
			break;
		case 4:

					pid=fork();
					int varlcl=0;
					int vargbl;
					if(pid==0)
					{
						vargbl++;
						varlcl++;
						printf("Child process %d",getpid());
						printf("\n");
						//4wait(&status);
						printf("Child process :: var_lcl [%d] , var_gbl[%d] ",varlcl,vargbl,"\n");
						printf("\n");

					}
					else if(pid>0)
					{
						printf("Parent process %d",getpid());
						printf("\n");
						varlcl=10;
						vargbl=20;

						printf("Parent process :: var_lcl [%d] , var_gbl[%d] ",varlcl,vargbl,"\n");

						printf("Child process exit code %d ",WIFEXITED(status));
						wait(&status);


					}
					break;
		case 5:

			//printf("Enter COmmand you want to execute:");
			//scanf("%s", command[0]);
			execvp(command[0],command);
			break;
		}
	}while(choice!=0);
	return EXIT_SUCCESS;
}
