
## compile
mvn clean compile package -Dmaven.test.skip=true


Release Notes - Hive-tools - Version 0.1.4

** HISTORY
 * [hive-tools-0.1.5]
   MetaDataMerge add update SEQUENCE_TABLE NO

 * [hive-tools-0.1.4]
   MetastoreChangelog -z=zkHost -c=changelog -d=database -t=table
   thrift -gen java src/main/thrift/MetastoreUpdater.thrift

 * [hive-tools-0.1.3]
    - delete database metedata database_name/table_name support % wildcard

 * [hive-tools-0.1.2]
    - hdfs proxy user test

 * [hive-tools-0.1.1]
    - delete database metedata

 * [hive-tools-0.1.0]
    - hive meta schema convert to java bean
    - multiple hive meta merge