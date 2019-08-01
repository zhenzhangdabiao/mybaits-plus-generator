package com.baomidou.mybatisplus.samples.generator.service.impl;

import com.baomidou.mybatisplus.samples.generator.entity.Person;
import com.baomidou.mybatisplus.samples.generator.mapper.PersonMapper;
import com.baomidou.mybatisplus.samples.generator.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-08-01
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
