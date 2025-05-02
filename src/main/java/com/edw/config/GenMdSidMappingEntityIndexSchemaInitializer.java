package com.edw.config;

import com.edw.bean.GenMdSidMappingEntity;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.ProtoSchema;

/**
 * <pre>
 *  com.edw.config.GenMdSidMappingEntity
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 May 2025 9:56
 */
@ProtoSchema(
        includeClasses = {
                GenMdSidMappingEntity.class
        },
        schemaFileName = "GenMdSidMappingEntity.proto",
        schemaFilePath = "default/",
        schemaPackageName = "default")
public interface GenMdSidMappingEntityIndexSchemaInitializer extends SerializationContextInitializer {
}
