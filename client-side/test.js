ProfileBtn(){
    if(isLoggedIn = false){
        function userLogin() {
            const userName = document.querySelector("#userName");
            const userPassword = document.querySelector("#userPassword");
            const userLoginBtn = document.querySelector("#loginBtn");
          
            userLoginBtn.addEventListener("click", () => {
              const userNameValue = userName.value;
              console.log(userNameValue);
              const userPasswordValue = userPassword.value;
              console.log(userPasswordValue);
              apiHelpers.getRequest(
                `http://localhost:8080/api/users/${userNameValue}`,
                (userProfile) => {
                  console.log(userProfile);
                
                  isLoggedIn = true;
                  app.innerHTML = UserProfile(userProfile);
                }
              );
              
            });
          }
    }
    else{
        (userProfile) => {
            console.log(userProfile);
          
            isLoggedIn = true;
            app.innerHTML = UserProfile(userProfile);
          }
    }
    
}