While launching ElastiCache it will launch in VPC with security groups.
For Lambda finctions to use the elastic cache make sure you have role access to VPC and your function should be in same VPC and Same Security Group.
Else it wont get access to your cache cluster.
While launching EC2 Instance this should also present in same VPC,Security group and have access Inbound, Outbound access to the Cache Cluster.
Else it wont connect to the ElastiCache Cluster.
