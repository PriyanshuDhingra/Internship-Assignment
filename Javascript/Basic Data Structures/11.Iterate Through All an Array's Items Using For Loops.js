function filteredArray(arr, elem) {
  let newArr = [];
  // Only change code below this line
    for(let i=0;i<arr.length;i++){
      let flag=0;
      for(let j=0;j<arr[i].length;j++){
        if(arr[i][j]===elem){
          flag=1;
          break;
        }
      }
      if(flag==0)
        newArr.push(arr[i]);
    }
  // Only change above below this line
  return newArr;
}
console.log(filteredArray([[3, 2, 3], [1, 6, 3], [3, 13, 26], [19, 4, 9]], 3));
