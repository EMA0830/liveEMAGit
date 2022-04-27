// PLAIN OLD JAVASCRIPT
// datatypes that are type safe
var x: string | number; // undefined
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
let message: string;
let message1 = "welcome";

interface Product {
  productId: string;
  price: number;
  qty: number;
}
interface Product {
  productId: string;
  price: number;
  prodcutName: string;
}
const product: Product = {
  productId: "P01",
  price: 10,
  qty: 50,
  prodcutName: "TS",
};

console.log(product);

// CLASSES
class Product {
  productId: string;
  prodcutName: string;
  price: number;

  constructor(productId: string, prodcutName: string, price: number) {
    this.productId = productId;
    this.prodcutName = prodcutName;
    this.price = price;
  }
}

var productObject = new Product("p1", "ts", 30);
console.log(productObject);

const productObject1: Product = new Product("p1", "ts", 30);

interface NetBanking {
  customerId: string;
  pin: number;
  displayAccountDetails(): void;
  getAccountDetails():string;
}

class SavingsAccount {
  customerId: string;
  pin: number;
  constructor(customerId: string, pin: number) {
    this.customerId = customerId;
    this.pin = pin;
  }

  displayAccountDetails(): void {
    console.log("INSIDE THE FUNCTION");
    console.log(this.customerId, ">>>>", this.pin);
  }

  getAccountDetails(): string {
    return "Returned " + this.customerId + ">>>>" + this.pin;
  }
}

const netBanking: NetBanking = new SavingsAccount("c1", 123);
console.log(netBanking);
netBanking.displayAccountDetails();
const returnVal:string = netBanking.getAccountDetails();
console.log(returnVal);

// lamdba expressions
let adder = (num1 : number, num2 : number) => {
   return `Result is ${num1+num2}`;
};

console.log(adder(1,2));

var sprints: Array<string>;
// Type 'number' is not assignable to type 'string'
// sprints = ['java','junit','ts',150];
sprints = ['java','junit','ts'];
console.log(sprints)
