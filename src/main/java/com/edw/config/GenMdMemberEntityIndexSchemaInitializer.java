package com.edw.config;

import com.edw.bean.GenMdMemberEntity;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.ProtoSchema;

/**
 * <pre>
 *  com.edw.config.GenMdMemberEntity
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 May 2025 9:54
 */
@ProtoSchema(
        includeClasses = {
                GenMdMemberEntity.class
        },
        schemaFileName = "GenMdMemberEntity.proto",
        schemaFilePath = "default/",
        schemaPackageName = "default")
public interface GenMdMemberEntityIndexSchemaInitializer extends SerializationContextInitializer {
}
