// membuat method person
var person = {
    fullName: function() {
        return this.firstname + " " + this.lastName; 
    }
}

var person1 = {
    firstname:"Adil",
    lastName: "el-faruqi"
}

var person2 = {
    firstname: "Bagus",
    lastName:  "Bayu"
}

console.log("Mengunakan method call untuk menampilkan objek person 2 : ")

//memanggil method menggunakan method call()
console.log(person.fullName.call(person2));