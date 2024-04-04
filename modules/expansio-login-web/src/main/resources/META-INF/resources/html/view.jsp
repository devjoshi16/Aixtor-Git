<%@ include file="/init.jsp"%>

<portlet:actionURL name="/login" var="loginButtonURL" />


<section class="vh-100">
  <div class="container-fluid h-custom">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-md-9 col-lg-6 col-xl-5">
        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
          class="img-fluid" alt="Sample image">
      </div>
      <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
       <form action = "${loginButtonURL}" method = "POST">

          <p class="lead fw-normal mb-5 me-3">Sign in</p>

          <div class="form-outline mb-4">
            <input type="email" name = "<portlet:namespace/>email"
              class="form-control form-control-lg" value="${username}" autocomplete="off"
              placeholder="Email" />
          </div>

          <div class="form-outline mb-3">
            <input type="password" name = "<portlet:namespace/>password" 
            class="form-control form-control-lg" value="${password}" autocomplete="off"
              placeholder="Password" />
          </div>

          <div class="d-flex justify-content-between align-items-center">
   
            <div class="form-check mb-0">
              <input class="form-check-input me-2" type="checkbox" value=""/>
              <label class="form-check-label" >
                Remember me
              </label>
            </div>
            <a href="http://localhost:8080/home?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&_com_liferay_login_web_portlet_LoginPortlet_mvcRenderCommandName=%2Flogin%2Fforgot_password&saveLastPath=false" class="text-body">Forgot password?</a>
          </div>

          <div class="text-center text-lg-start mt-4 pt-2">
          <p class="text-danger">${error}</p>
            <button type="submit" class="btn btn-primary btn-lg"
              style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
            <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="http://localhost:8080/home?p_p_id=com_liferay_login_web_portlet_LoginPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&_com_liferay_login_web_portlet_LoginPortlet_mvcRenderCommandName=%2Flogin%2Fcreate_account&saveLastPath=false"
                class="link-danger">Register</a></p>
          </div>

        </form>
      </div>
    </div>
  </div>

</section>