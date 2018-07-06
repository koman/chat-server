package com.bmw.chat.server.configuration;

//@Profile({"dev","test"})
//@Configuration
public class CassandraConfig /*extends AbstractCassandraConfiguration */{
 
//    @Override
//    protected String getKeyspaceName() {
//        return "ebook_chat";
//    }
//
//    @Bean
//    @Override
//    public CassandraClusterFactoryBean cluster() {
//        CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
////        cluster.setContactPoints("localhost");
//        cluster.setContactPoints("13.80.98.110");
//        cluster.setPort(9042);
//        cluster.setKeyspaceCreations(
//        		Arrays.asList(
//        				new CreateKeyspaceSpecification("ebook_chat")
//        				.ifNotExists()
//        				.withSimpleReplication(1))
//        		);
//        cluster.setStartupScripts(Arrays.asList(
//        		"USE ebook_chat",
//        		"CREATE TABLE IF NOT EXISTS messages (" +
//					"username text," +
//					"chatRoomId text," +
//					"date timestamp," +
//					"fromUser text," +
//					"toUser text," +
//					"text text," +
//					"PRIMARY KEY ((username, chatRoomId), date)" +
//				") WITH CLUSTERING ORDER BY (date ASC)"
//        		)
//        );
//        return cluster;
//    }

//    @Bean
//    @Override
//    public CassandraMappingContext cassandraMapping()
//      throws ClassNotFoundException {
//        return new BasicCassandraMappingContext();
//    }
}
