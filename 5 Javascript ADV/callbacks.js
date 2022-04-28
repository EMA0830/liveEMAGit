// sync calls
// for(var i = 0; i< 100; i+=2){
//    console.log(i);
// }
// for(var i = 1; i< 100; i++){
//    console.log(i);
// }

// async
// setTimeout after 5 seconds calls the callMe
// console.log("Timeout *************************************************")
// setTimeout(function callMe(){
// for(var i = 0; i< 100; i+=2){
//    console.log(i);
// }
// },5000)

// for(var i = 1; i< 100; i++){
//    console.log(i);
// }

// lambda callback
// setTimeout(() => {
// for(var i = 0; i< 100; i+=2){
//    console.log(i);
// }
// },5000)
var i = 0;
while (i < 10) {
  // block scoped variable
  const iVal = i;
  setTimeout(() => {
    console.log(iVal);
  }, i * 500);
  i = i + 2;
}
var i = 1;
while (i < 10) {
  // block scoped variable
  const iVal = i;
  setTimeout(() => {
    console.log(iVal);
  }, i * 1000);
  i = i + 2;
}

// storing function in a variable
var functionVar = function (a, b) {
  console.log(a);
  console.log(b);
  result = a + b;
  console.log(result);
  console.log("************");
};

functionVar(1, 2);
