/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.ml.h2o.models;

/**
 * Helper class allowing us to call H2OMOJOPipelineModel.createFromMojo defined in Scala via Py4j
 */
public class JavaH2OMOJOPipelineModelHelper {

  public static H2OMOJOPipelineModel createFromMojo(String path){
    return py_sparkling.ml.models.H2OMOJOPipelineModel$.MODULE$.createFromMojo(path);
  }

}
