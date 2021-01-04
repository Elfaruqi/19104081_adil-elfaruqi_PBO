var person = {
    fullName: function(birth, city) {
        return this.firstName + " " + this.lastName + "," + birth + "," + city;
    }
};

var person1 = {
    firstName: "Ajeng",
    lastName: "Fitria"
};

// menggunakan apply
console.log(person.fullName.apply(person1, ["Desember", "Cilalap"]));

// jika menggunakan call
// person.fullName.apply(person1, ["Desember", "Cilalap"]);