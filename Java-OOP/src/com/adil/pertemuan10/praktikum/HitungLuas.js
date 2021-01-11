//constructor persegipanjang
function PersegiPanjang (panjang, lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
}


PersegiPanjang.prototype.getLuas = function () {
    var luas = this.panjang * this.lebar;
    console.log("Luas : ", this.panjang, " x ", this.lebar, " : ", luas)   
};

PersegiPanjang.prototype.print = function () {
    console.log("Panjang sisi : ", this.panjang)
    console.log("Lebar sisi:", this.lebar)
}

//mewarisi properti PersegiPanjang
function Persegi(sisi){
    this.panjang = sisi;
    this.lebar = sisi;
}

Persegi.prototype = new PersegiPanjang();
Persegi.prototype.constructor = PersegiPanjang;

Persegi.prototype.print = function(){
    console.log("Panjang sisi: ", this.panjang)
}

const prompt = require('prompt-sync')();

console.log('Persegi Panjang')

var obPersegiPanjang = new PersegiPanjang(
    prompt('Masukkan panjang : '),
    prompt('Masukkan lebar : ')
)


console.log('\nPersegi')
var obPersegi = new Persegi(
    prompt('Masukkan panjang sisi : ')
)

console.log('\n\nMenghitung luas persegiPanjang')
obPersegiPanjang.print()
obPersegiPanjang.getLuas();

console.log('\n\nMenghitung luas persegi')

//memanggil method dari parent constructor
obPersegi.print();
obPersegi.getLuas();