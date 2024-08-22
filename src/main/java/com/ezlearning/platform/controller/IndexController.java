package com.ezlearning.platform.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezlearning.platform.dto.OrderPay;
import com.ezlearning.platform.services.core.impl.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

/**
 * MVC Index Controller
 */
@Controller
@RequestMapping("/")
@Slf4j
public class IndexController {
	
	@Autowired
    private PaypalService paypalService;

    public static final String successUrl = "http://localhost:8080/pay/success";
    public static final String cancelUrl = "http://localhost:8080/pay/cancel";
    
    @GetMapping({"/", "/index"})
    public String index() {
    	//bad m logv shi krna h
       // log.info("Home page");
        return "index";
    }

    @GetMapping("/discover")
    public String discover() {
        return "discover";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }

    @GetMapping("/logout-success")
    public String logoutPage(Model model) {
        return "logout";
    }
    @GetMapping("/pay")
    public String pay(Model model) {
        return "payment";
    }
    
    @RequestMapping("/payment")
    public String payment(@ModelAttribute("order") OrderPay theOrder) throws PayPalRESTException {
        try {
            Payment thePayment = paypalService.createPayment(theOrder.getPrice(), theOrder.getCurrency(),
                    theOrder.getMethod(), theOrder.getIntent(), theOrder.getDescription(), cancelUrl, successUrl);
            for (Links links: thePayment.getLinks()){
                if(links.getRel().equals("approval_url")){
                    System.out.println(links.getHref());
                    return "payment:"+links.getHref();
                }
            }
        }
        catch (PayPalRESTException payPalRESTException) {
            payPalRESTException.printStackTrace();
        }
        return "payment";
    }

    @GetMapping("/success")
    public String successPay(@RequestParam("paymentId") String paymentId, @RequestParam("PayerID") String payerId) {
        try {
            Payment payment = paypalService.executePayment(paymentId, payerId);
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
                return "success";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "payment";
    }

    
}