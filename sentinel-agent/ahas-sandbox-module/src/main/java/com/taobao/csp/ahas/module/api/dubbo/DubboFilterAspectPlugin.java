package com.taobao.csp.ahas.module.api.dubbo;

import com.taobao.csp.ahas.service.bridge.aop.AspectPlugin;
import com.taobao.csp.ahas.service.bridge.aop.Enhancer;
import com.taobao.csp.ahas.service.bridge.aop.PointCut;

public class DubboFilterAspectPlugin implements AspectPlugin {
   public PointCut getPointCut() {
      return new DubboFilterPointCut();
   }

   public Enhancer getEnhancer() {
      return new DubboFilterEnhancer();
   }
}
