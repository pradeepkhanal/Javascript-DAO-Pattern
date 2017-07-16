function StudentService(){
    return{
        stdList : [],
        insert:function(std){
          this.stdList.push(std);},
          getAll:function(){
              return this.stdList;
          },
          count:function(){
              return this.stdList.length;
          },
          getByIndex:function(index){
              return this.stdlist[index];
              
          }
            
      
      
    };
}