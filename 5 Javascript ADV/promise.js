// sytax
// var promise = new Promise(function(resolve, reject){
//    //async logic
// })

// verbose code
// var colorfulPromise = new Promise(function (resolveFunction, rejectFunction) {
//   //async logic
//   const color = "green";
//   if (color === "green") {
//     resolveFunction();
//   }
//   if (color == "red") {
//     rejectFunction();
//   }
// });

// var successFunction = function () {
//   console.log("Promise Resolved : Green color");
// };
// var failedFunction = function () {
//   console.log("Promise Rejected : Red color");
// };
// colorfulPromise.then(successFunction).catch(failedFunction);

// short hand
var colorfulPromise = new Promise(function (resolveFunction, rejectFunction) {
  //async logic
  const color = "green";
  if (color === "green") {
    setTimeout(()=> resolveFunction(),5000)
  }
  if (color == "red") {
    rejectFunction();
  }
});

colorfulPromise.then(()=> console.log("Promise Resolved : Green color")).catch(() => console.log("Promise Rejected : Red color") );