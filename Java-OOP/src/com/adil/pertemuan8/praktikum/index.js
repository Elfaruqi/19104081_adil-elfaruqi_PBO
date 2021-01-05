// Langsung dengan value

var person1 = {
    name: "Henken"
};

//Buat object baru
var person2 = new Object();
person2.name = "Sage";

//Menambahkan property baru
person1.age = 20;
person2.age = 25;

//Akses properti dengan cara pertama
console.log(`Object dari person1\t: \n 
name\t: ${person1.name}\n age\t: ${person1.age}`);

console.log("");

//Akses properti dengan cara kedua
console.log(`Object dari person2\t: \n 
name\t: ${person2.name}\n age\t: ${person2.age}`);

