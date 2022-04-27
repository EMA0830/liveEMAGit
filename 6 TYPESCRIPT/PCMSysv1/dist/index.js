// PLAIN OLD JAVASCRIPT
// datatypes that are type safe
var x; // undefined
x = 10;
console.log(x);
x = 1.05;
console.log(x);
x = "welcome";
console.log(x);
// Type 'boolean' is not assignable to type 'string | number'
// x = true;
x = 100;
console.log(x);
let y = 10;
console.log(y);
// ONlY TYPESCRIPT
let message;
let message1 = "welcome";
const product = {
    productId: "P01",
    price: 10,
    qty: 50,
    prodcutName: "TS",
};
console.log(product);
// CLASSES
class Product {
    constructor(productId, prodcutName, price) {
        this.productId = productId;
        this.prodcutName = prodcutName;
        this.price = price;
    }
}
var productObject = new Product("p1", "ts", 30);
console.log(productObject);
const productObject1 = new Product("p1", "ts", 30);
class SavingsAccount {
    constructor(customerId, pin) {
        this.customerId = customerId;
        this.pin = pin;
    }
    displayAccountDetails() {
        console.log("INSIDE THE FUNCTION");
        console.log(this.customerId, ">>>>", this.pin);
    }
    getAccountDetails() {
        return "Returned " + this.customerId + ">>>>" + this.pin;
    }
}
const netBanking = new SavingsAccount("c1", 123);
console.log(netBanking);
netBanking.displayAccountDetails();
const returnVal = netBanking.getAccountDetails();
console.log(returnVal);
// lamdba expressions
let adder = (num1, num2) => {
    return `Result is ${num1 + num2}`;
};
console.log(adder(1, 2));
var sprints;
// Type 'number' is not assignable to type 'string'
// sprints = ['java','junit','ts',150];
sprints = ['java', 'junit', 'ts'];
console.log(sprints);
