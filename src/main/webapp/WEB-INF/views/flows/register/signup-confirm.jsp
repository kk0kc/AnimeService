<%@include file="../shared/flows-header.jsp" %>

<div class="container">
    <div class="row">
        <center><div class="col-sm-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>Personal Details</h4>

                </div>
                <div class="panel-body">
                    <div class="text-center">
                        <h4>Name : ${registerModel.user.firstName }</h4>
                        <h5>Email : ${registerModel.user.email }</h5>
                    </div>

                </div>
                <div class="panel-footer">
                    <a href="${flowExecutionUrl }&_eventId_personal"

                       class="btn btn-primary">Edit</a>

                </div>

            </div>

        </div></center>
    <div class="row">
        <div class="col-sm-4 col-sm-offset-4">
            <div class="text-center">
                <a href="${flowExecutionUrl }&_eventId_submit"
                   class="btn btn-primary">Confirm</a>

            </div>
        </div>
    </div>
</div>


<%@ include file="../shared/flows-footer.jsp" %>