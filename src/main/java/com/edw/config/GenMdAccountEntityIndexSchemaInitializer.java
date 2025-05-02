package com.edw.config;

import com.edw.bean.GenMdAccountEntity;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.ProtoSchema;

/**
 * <pre>
 *  com.edw.config.GenMdAccountEntityIndexSchemaInitializer
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 May 2025 9:47
 */
@ProtoSchema(
        includeClasses = {
                GenMdAccountEntity.class
        },
        schemaFileName = "GenMdAccountEntity.proto",
        schemaFilePath = "default/",
        schemaPackageName = "default")
public interface GenMdAccountEntityIndexSchemaInitializer extends SerializationContextInitializer {
}
