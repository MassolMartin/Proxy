/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.AMS.ClubDePlongee.proxy.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Miage
 */
@Component
public class LogFilter extends ZuulFilter {
    
    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Override
    public String filterType() {
        // Filtre appliqué avant traitement rqt
        return "pre";
    }

    @Override
    public int filterOrder() {
        // On ordonne les filtres
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        // Condition activitation filtre. Tjs actif
        return true;
    }

    /**
     * Code du filtre
     * @return
     * @throws ZuulException 
     */
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest req = RequestContext.getCurrentContext().getRequest();
        logger.info("/////------>Requête reçue : {} ", req.getRequestURL());
        return null;
    }
}
