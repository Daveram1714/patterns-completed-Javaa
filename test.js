function AllDivisors(n){
    let list = [];
    for(let i = 1; i<=Math.sqrt(n);i++){
        if(n%i === 0 ){
            list.push(i)
        if(n/i !== i)
            list.push(n/i)
        }
    }

    
    console.log(list.sort((a,b)=>a-b))

}

AllDivisors(36)