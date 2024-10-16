package com.example.akka.directdebit.importer.fileimport;

import akka.stream.Materializer;
import akka.stream.javadsl.Source;

public record FileLoaderImpl(Materializer materializer) implements FileLoader {
    @Override
    public Source<ImportProcessFlow.Payment, ?> load(String location) {
        return ImportFileUtil.loadFromFile(location,materializer);
    }
}
