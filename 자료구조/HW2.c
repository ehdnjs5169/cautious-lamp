#include <stdio.h>

int factnum(int num)
{
	if (num == 0) return 1;

	else
	{
		int rst = factnum(num - 1);
		printf("%d!=%d\n", num, num*rst);
		return num * rst;
	}
}

int main()
{
	int num, rst;
	num = 5;
	rst = num * factnum(num - 1);
	printf("fact(%d)=%d\n", num, rst);

}