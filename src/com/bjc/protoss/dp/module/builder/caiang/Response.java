/*
 *
 *  * ----------------------------------------------------------------------
 *  * COPYRIGHT Ericsson 2016
 *  *
 *  * The copyright to the computer program(s) herein is the property of
 *  * Ericsson Inc. The programs may be used and/or copied only with written
 *  * permission from Ericsson Inc. or in accordance with the terms and
 *  * conditions stipulated in the agreement/contract under which the
 *  * program(s) have been supplied.
 *  * ----------------------------------------------------------------------
 *
 */

package com.bjc.protoss.dp.module.builder.caiang;

/**
 * Created by zcaiang on 14/03/2018.
 */
public class Response {
    int status = 0;
    String language;
    String mediaType;
    String content;

    public static class ResponseBuilder {
        int status = 0;
        String language;
        String mediaType;
        String content;

        public ResponseBuilder(int status) {
            this.status = status;
        }

        public ResponseBuilder setStatus(int status) {
            this.status = status;
            return this;
        }

        public ResponseBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public ResponseBuilder setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public ResponseBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public Response build() {
            return new Response(this);
        }
    }

    public Response(ResponseBuilder builder) {
        this.status = builder.status;
        this.content = builder.content;
        this.language = builder.language;
        this.mediaType = builder.mediaType;
    }

    @Override
    public String toString() {
        return "Response{" + "status=" + status + ", language='" + language + '\'' + ", mediaType='" + mediaType + '\''
                + ", content='" + content + '\'' + '}';
    }
}
