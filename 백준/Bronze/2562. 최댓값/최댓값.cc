#include <stdio.h>

int main(void) {
	int arr[9];
	int max=0, cnt=0, i;
	for(i=0; i<9; i++) {
		scanf("%d",&arr[i]);
	}
	for(i=0; i<9; i++) {
		if(arr[i]>max) {
			max=arr[i];
			cnt = i+1;
		}	
	}
	printf("%d\n%d", max, cnt);
}