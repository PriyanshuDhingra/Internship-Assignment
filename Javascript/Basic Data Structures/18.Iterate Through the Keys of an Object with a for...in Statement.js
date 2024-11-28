let users = {
  Alan: {
    age: 27,
    online: false
  },
  Jeff: {
    age: 32,
    online: true
  },
  Sarah: {
    age: 48,
    online: false
  },
  Ryan: {
    age: 19,
    online: true
  }
};

function countOnline(obj) {
  // Only change code below this line
  let noOfOnlineUsers=0;
   console.log(JSON.stringify(obj));
    
  for(let userObj in obj){
    if(users[userObj].online===true)
      noOfOnlineUsers++;
  } 
  return noOfOnlineUsers;
  // Only change code above this line
}

console.log(countOnline(users));
