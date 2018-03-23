<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Customer</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Klient</h1>
				<p>Dane kupujacego</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="order.customer" class="form-horizontal">
			<fieldset>
				<legend>Formularz</legend>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="customerId" />Id Klienta</label>
					<div class="col-lg-10">
						<form:input id="customerId" path="customerId" type="text" class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Imie i Nazwisko</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="doorNo">Numer domu</label>
					<div class="col-lg-10">
						<form:input id="doorNo" path="billingAddress.doorNo" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="streetName">Nazwa ulicy</label>
					<div class="col-lg-10">
						<form:input id="streetName" path="billingAddress.streetName." type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="areaName">Dzielnica</label>
					<div class="col-lg-10">
						<form:input id="areaName" path="billingAddress.areaName" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="state">wojewodztwo</label>
					<div class="col-lg-10">
						<form:input id="state" path="billingAddress.state" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="country">kraj</label>
					<div class="col-lg-10">
						<form:input id="country" path="billingAddress.country" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="zipCode">kod pocztowy</label>
					<div class="col-lg-10">
						<form:input id="zipCode" path="billingAddress.zipCode" type="text"
							class="form:input-large" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="phoneNumber">numer telefonu</label>
					<div class="col-lg-10">
						<form:input id="phoneNumber" path="phoneNumber" type="text"
							class="form:input-large" />
					</div>
				</div>

				<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Dalej" name="_eventId_customerInfoCollected" />
						<button id="btnCancel" class="btn btn-default" name="_eventId_cancel">Anuluj</button>
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
