Name: Abylay Altynbassov
Group: SE-2514

Description:
In this experiment I chose linear search, insertion sort and merge sort. I will use sorted and random versions of 10, 100, 10000 sized number sequences to
see how fast these algorithms run on each of them and analyse the results.

I chose linear search for search algorithm. This algorithm goes through each element in order one by one in a linear fashion until sequence ends or it finds
the target. Its time complexity is O(n).

For basic sorting algorithm I used insertion sort. This sorting algorithm orders elements in the left side by bringing each unordered element back
until the unordered element is bigger than some orderered element. It's time complexity is O(n^2) but for sorted sequence it is O(n) because for sorted sequences,
each unordered element is only compared once then inserted.

For advanced sorting algorithm I chose merge sort which divides the sequence recursively until each
element is alone and then brings elements recursively back into bigger sequences while ordering those small parts one by one. Time complexity is O(nlogn) because
dividing stage is just logn and its not important when compared to merging stage whcih is around nlogn. Merging stage is nlogn because logn recursion stages and kn 
steps for each stage due to comparisons and insertsions.

Table for executions of sorting algorithms:
<img width="1041" height="515" alt="Screenshot 2026-04-26 221343" src="https://github.com/user-attachments/assets/1568fade-95ba-4b7a-9104-ef6705e70bd3" />

Table for execution of searching algorithms:
<img width="1047" height="515" alt="Screenshot 2026-04-26 220721" src="https://github.com/user-attachments/assets/94e3b084-b710-4e8e-92ae-4bc7d5d5a5d6" />

Analysis questions:




Screenshots:

<img width="1919" height="641" alt="Screenshot 2026-04-26 205042" src="https://github.com/user-attachments/assets/6de3fa07-4610-463f-9b64-9a0e25a3ac9a" />
<img width="1919" height="946" alt="Screenshot 2026-04-26 205054" src="https://github.com/user-attachments/assets/f04c4c04-f995-4bb9-9820-7cbe5086d781" />
<img width="1904" height="1079" alt="Screenshot 2026-04-26 205111" src="https://github.com/user-attachments/assets/cd4e007b-aed1-4f6f-b9db-c7de3f3eeaf7" />
<img width="1912" height="1079" alt="Screenshot 2026-04-26 205121" src="https://github.com/user-attachments/assets/13185d3a-4499-4f1b-83ee-24e48dc07991" />
<img width="1919" height="1079" alt="Screenshot 2026-04-26 205135" src="https://github.com/user-attachments/assets/8f910b57-e980-4979-ae1f-3b8d2b0fb824" />
<img width="1919" height="1079" alt="Screenshot 2026-04-26 215625" src="https://github.com/user-attachments/assets/dc257b03-9a6a-49de-94be-982ee5409130" />
<img width="1918" height="1079" alt="Screenshot 2026-04-26 215643" src="https://github.com/user-attachments/assets/011e17b4-66e5-41b5-832d-ac069d13760a" />

Reflections section:

1) I had a difficulty with merge sort for 2 reasons: first I though that changes in the merge phase didn't make sense becuase they didnt get saved but then
   I realised that they all matter because they change the array because everytime function receives the memory address of the same array. Secondly, I had
   problem with indexing of merge sort at merge phase and had trouble calculating correct indexes for left, right, temp and actual array and had to suffer
   many index out of bound exceptions
2) Also, for merge sort it took longer than insertion sort even for random lists when I made the temp array the size of the actual array, so I had to
   change the size of temp array to only the part that I am merging and made it size of start+end-1 not size of x.length and it led to better performance
   than insertion sort for random sequences.


