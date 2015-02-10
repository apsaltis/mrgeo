/*
 * Copyright 2009-2014 DigitalGlobe, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package org.mrgeo.mapalgebra;

import org.mrgeo.featurefilter.BoundaryFeatureFilter;
import org.mrgeo.featurefilter.FeatureFilter;

public class BoundaryMapOp extends FeatureFilterMapOp
{
  BoundaryFeatureFilter _filter = new BoundaryFeatureFilter();
  
  @Override
  public FeatureFilter getFilter()
  {
    return _filter;
  }
  
  public static String[] register()
  {
    return new String[] { "boundary" };
  }

  @Override
  public String toString()
  {
    return String.format("BoundaryMapOp %s",
       _outputName == null ? "null" : _outputName.toString() );
  }
}