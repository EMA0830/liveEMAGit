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
// var i = 0;
for(var i = 0; i< 10; i+=2){
   // block scoped variable
   const iVal = i;
   setTimeout(() => { console.log(iVal)},1000);
}
for(var i = 1; i< 10; i+=2){
   // block scoped variable
   const iVal = i;
   setTimeout(() => { console.log(iVal)},1000);
}