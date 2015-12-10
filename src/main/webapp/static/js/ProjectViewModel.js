function ProjectViewModel() {
	var self = this;

	self.prjId = ko.observable("");
	self.prjNumber = ko.observable("");
	self.prjName = ko.observable("");
	self.proCustomer = ko.observable("");
	self.proGroup = ko.observable("");
	self.proMember = ko.observableArray([]);
	self.proStatus = ko.observable("");

	self.beginingDate = ko.observable("");
	self.finishingDate = ko.observable("");

	self.grpLeader = ko.observableArray([]);
	self.projects = ko.observableArray([]);
	
	/*
	 * Default list view data
	 */
	$.ajax({
		method : "POST",
		url : "/query",
		data : {
			name : self.prjName
		}

	}).done(function(data) {
		self.projects(data);
	});
	
	/*
	 * Query action
	 */
	self.query = function() {
		$.ajax({
			method : "POST",
			url : "/query",
			data : {
				name : self.prjName
			}

		}).done(function(data) {
			self.projects(data);
		});
	}
	
}

$(document).ready(function() {
	
	ko.applyBindings(new ProjectViewModel());
});

var stringToDate = function(strDate) {
	var objDate = strDate.split(".");
	var d = new Date(objDate[2], objDate[1] - 1, objDate[0]);
	var newDate = new Date(Date.UTC(d.getFullYear(), d.getMonth(), d.getDate(), d.getHours(), d.getMinutes(), d.getSeconds(), d.getMilliseconds()));
	return newDate.getTime();
}

var dateToString = function(objDate) {
	//console.log(objDate);
	if(!isEmpty(objDate)) {
		var date = new Date(objDate).toISOString().replace(/-/g, '\/').replace(/T.+/, '').split("/");
		return date[2] + "." + date[1] + "." + date[0];
	}
	return "";
}

var isEmpty = function(value) {
return (value === undefined || value == null || value.length <= 0) ? true : false;
}