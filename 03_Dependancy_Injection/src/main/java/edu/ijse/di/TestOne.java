package edu.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestOne implements DiInterface {
    DI di;

   // @Autowired -not required for constructor through injection
//    TestOne(DI di){
//       this.di=di;
//    }

//    @Autowired
//    public void setDi(DI di){
//        this.di=di;
//    }

  public void chatWithTwo(){
      di.chat();
  }

    @Override
    @Autowired // these are executed on the populate properties
    public void inject(DI di) {
       this.di=di;
    }
}
