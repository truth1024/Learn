$(function () {
	Highcharts.setOptions({
	       lang: {
	              decimalPoint : ",",
	              downloadJPEG : "下载JPEG图片",
	              exportButtonTitle : "下载图片",
	              printButtonTitle : "打印报表",
	              numericSymbols: [' thousands', 'millions'],
	              months: ['Janvier', 'Février','Mars', 'Avril', 'Mai', 'Juin',
	                            'Juillet', 'Ao?t','Septembre', 'Octobre', 'Novembre', 'Décembre'],
	              weekdays: ['Dimanche', 'Lundi','Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']
	       }
	});
	 var chart = new Highcharts.Chart({
	       chart: {
	              renderTo: 'container',
	              borderWidth : 1,
	              defaultSeriesType: 'column'
	       },
	       xAxis: {
	              categories: ['Jan', 'Feb', 'Mar','Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
	       },
	       yAxis: {
	              type: 'logarithmic'
	       },
	       series: [{
	              data: [0.029, 71.5, 1.06, 1292,14400, 1.760, 135, 148000, 0.0216, 0.194, 9.56, 54.4]       
	       }]
	});        
});
    
