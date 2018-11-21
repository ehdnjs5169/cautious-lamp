#include<stdio.h>
#include<stdlib.h>
struct Node {
	int data;
	struct Node *next;
};
void ArrayNodeAtEnd(struct Node **head, int n)
{
	struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
	newNode->data = n;
	newNode->next = NULL;
	struct Node *temp = *head;
	if (*head == NULL) {
		*head = newNode;
	}
	else {
		while (temp->next!= NULL)
			temp = temp->next;
		temp->next = newNode;
	}
}
void PrintList(struct Node *head)
{
	struct Node *current = head;
	while (current != NULL)
	{
		printf("%d ", current->data);
		current = current->next;
	}
	printf("\n");
}
int main()
{
	struct Node *head = NULL;
	ArrayNodeAtEnd(&head, 8);
	ArrayNodeAtEnd(&head, 6);
	PrintList(head);
	return 0;
}