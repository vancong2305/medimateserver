package com.example.medimateserver.service.impl;

import com.example.medimateserver.model.CouponDetail;
import com.example.medimateserver.service.CouponDetailService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class CouponDetailServiceImpl implements CouponDetailService {
    @Override
    public List<CouponDetail> findAll() {
        return null;
    }

    @Override
    public CouponDetail findById(BigInteger id) {
        return null;
    }

    @Override
    public CouponDetail findByEmail(String email) {
        return null;
    }

    @Override
    public CouponDetail save(CouponDetail couponDetail) {
        return null;
    }

    @Override
    public CouponDetail update(BigInteger id, CouponDetail couponDetail) {
        return null;
    }

    @Override
    public void deleteById(BigInteger id) {

    }
}
