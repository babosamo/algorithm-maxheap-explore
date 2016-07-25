#algorithm-maxheap-explore

max-heap 자료구조에 저장되어있는 데이타 중 
크기가 큰 k 개를 구해오는 문제.


MAX-HEAP <https://en.wikipedia.org/wiki/Min-max_heap>


## rule

max-heap 에 n개의 데이타가 존재한다.

root-node 를 통해서 k 개의 값을 반영하여라.

가장 큰 값 부터 큰 수를 반환한다.


## 예제

* 조건

					30
				/		\
			15				20
			/\				/\
		3		5		17		1
		
		K = 4

* 결과 
	
		30, 20, 17 , 15
	
	

## 예제 2

* 조건

									100
							/				\
					50								80
				/		\						/		\
			45				30				70				60
			/\				/\				/\				/\
		10		6		25		20		40		15		1		55
				
		K = 10
	
* 결과 
	
		100, 80, 70, 60, 55, 50, 45, 40, 30, 25
