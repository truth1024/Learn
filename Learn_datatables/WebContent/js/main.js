$(function(){
	var giCount = 0;
	var grid = $('#grid').dataTable({
//		bAutoWidth: false,
		bLengthChange : true,
		bPaginate : true,

//		bFilter:false
	});
	$('#click').click(function(){
		grid.fnAddData( [
		                 giCount+".1",
		                 giCount+".2",
		                 giCount+".3",
		                 giCount+".4",
		                 giCount+".5" ]
		               );
	});
});