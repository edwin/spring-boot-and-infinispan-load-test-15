package com.edw.config;

import com.edw.bean.GenMdInstrumentEntity;
import org.infinispan.protostream.SerializationContextInitializer;
import org.infinispan.protostream.annotations.ProtoSchema;

/**
 * <pre>
 *  com.edw.config.GenMdInstrumentEntityIndexSchemaInitializer
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 May 2025 9:52
 */
@ProtoSchema(
        includeClasses = {
                GenMdInstrumentEntity.class
        },
        schemaFileName = "GenMdInstrumentEntity.proto",
        schemaFilePath = "default/",
        schemaPackageName = "default")
public interface GenMdInstrumentEntityIndexSchemaInitializer extends SerializationContextInitializer {
}
