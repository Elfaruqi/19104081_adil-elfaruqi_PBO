const prompt = require('prompt-sync')(); // Deklarasi input dengan prompt

let object = {}
object.name = prompt(`Input Name\t: `)
object.age = prompt(' Input Age\t: ')
object.nim = prompt(' Input Nim\t: ')
object.prodi = prompt(' Input Prodi\t: ')

console.log("")

// Perunlangan for each untuk mendapatkan nama property
for(property in object){
    // Print nama property dan value nya
    console.log(property + `\t: ${object[property]}`)
}