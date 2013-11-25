$(function () { 
    $('#container').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: '我的第一个表格',
            
        },
        subtitle:{
        	text:'牛逼'
        },
        xAxis: {
            categories: ['my', 'first', 'chart']
        },
        yAxis: {
            title: {
                text: 'something'
            }
        },
        series: [{
            name: 'Jane',
            data: [1, 8, 4]
        }, {
            name: 'John',
            data: [5, 7, 3]
        }]
    });
    setTimeout(function(){
    	var chart = $('#container').highcharts();
    	chart.setTitle({text:'更改标题'});
    },2000);
});