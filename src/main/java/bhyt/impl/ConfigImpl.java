package bhyt.impl;

import bhyt.model.Config;
import bhyt.repository.ConfigRepository;
import bhyt.service.ConfigService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ConfigImpl implements ConfigService {
    private ConfigRepository configRepository;

    public ConfigImpl(ConfigRepository configRepository) {
        super();
        this.configRepository = configRepository;
    }

    @Override
    public Config updateConfig(Config config) {
        Config old = this.findConfig(1L);
        old.setSalary(config.getSalary());
        old.setWorker(config.getWorker());
        old.setRetirement(config.getRetirement());
        old.setMaternity(config.getMaternity());
        old.setUnemployment(config.getUnemployment());
        old.setOther(config.getOther());
        old.setFamilyOne(config.getFamilyOne());
        old.setFamilyTwo(config.getFamilyTwo());
        old.setFamilyThree(config.getFamilyThree());
        old.setFamilyFour(config.getFamilyFour());
        old.setFamilyFive(config.getFamilyFive());
        old.setPoor(config.getPoor());
        old.setNearPoor(config.getNearPoor());
        old.setStudent(config.getStudent());
        old.setFarmer(config.getFarmer());
        return configRepository.save(config);
    }

    @Override
    public Config findConfig(Long id) {
        return configRepository.findById(id).get();
    }
}
