let bird = {
  name: "Donald",
  numLegs: 2
};

let boat = {
  name: "Warrior",
  type: "race-boat"
};
// Only change code below this line
const glideMixin= (obj)=>{
    obj.glide= ()=>{console.log("glide from glideMixin");};
}

glideMixin(boat);
glideMixin(bird);



