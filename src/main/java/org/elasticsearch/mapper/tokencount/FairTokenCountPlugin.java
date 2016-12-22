package org.elasticsearch.mapper.tokencount;

import org.elasticsearch.indices.IndicesModule;
import org.elasticsearch.plugins.Plugin;

public class FairTokenCountPlugin extends Plugin {

    @Override
    public String name() {
        return "fair-token-count";
    }

    @Override
    public String description() {
        return "Adds the fair_token_count type allowing to calculate token count using stop words";
    }

    public void onModule(IndicesModule indicesModule) {
        indicesModule.registerMapper("fair_token_count", new FairTokenCountFieldMapper.TypeParser());
    }

}
