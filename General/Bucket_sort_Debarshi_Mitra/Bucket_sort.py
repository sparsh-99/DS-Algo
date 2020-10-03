def in_sort(a): 
	for i in range(1, len(a)): 
		u = a[i] 
		j = i - 1
		while j >= 0 and a[j] > u: 
			a[j + 1] = a[j] 
			j -= 1
		a[j + 1] = u	 
	return a	 
			
def bucket_sort(x): 
	arr = [] 
	slot = 10  
	for i in range(slot): 
		arr.append([]) 
		
	# Putting elements in different buckets... 
	for j in x: 
		index_b = int(slot * j) 
		arr[index_b].append(j) 
	
	# Sorting each bucket... 
	for i in range(slot): 
		arr[i] = in_sort(arr[i]) 
		

	k = 0
	for i in range(slot): 
		for j in range(len(arr[i])): 
			x[k] = arr[i][j] 
			k += 1
	return x 


x = [0.5,0.2,0.3,0.1,0.4] 
print("Sorted Array is") 
print(bucket_sort(x)) 