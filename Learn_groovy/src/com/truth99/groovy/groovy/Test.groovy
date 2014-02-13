def select(something){
	println "select ${something}"
	[from:{tablename->
		println "from tablename: ${tablename}"
		[where:{map->
			println """
                        Where :
                        username: ${map.username}
                        userage: ${map.userage}
                        """
		}]
	}]
}

select 'username' from 'user' where 'username':'tom','userage':25

def sendMessage(receiver, message) {
		println "sending ${message} to ${receiver.to}"
	}
 
	sendMessage "message info", to: "someone"
	
	
	def classes = [String, List, File]
	for (clazz in classes)
	{
	println clazz.package.name
	}