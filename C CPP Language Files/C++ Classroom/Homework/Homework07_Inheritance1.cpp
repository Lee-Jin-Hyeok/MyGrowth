#include <iostream>

class Car {
private:
	int gasolineGauge;
public:
	Car(int gasolineGauge) : gasolineGauge(gasolineGauge) {}
	int GetGasGauge() {
		return gasolineGauge;
	}
};

class HybridCar : public Car {
private:
	int electricGauge;
public:
	HybridCar(int gasolineGauge, int electricGauge) : Car(gasolineGauge), electricGauge(electricGauge) {}
	int GetElecGauge() {
		return electricGauge;
	}
};

class HybridWaterCar : public HybridCar {
private:
	int waterGauge;
public:
	HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) : HybridCar(gasolineGauge, electricGauge), waterGauge(waterGauge) {}
	void ShowCurrentGauge() {
		std::cout << "�ܿ� ���ָ� : " << GetGasGauge() << std::endl;
		std::cout << "�ܿ� ���ⷮ : " << GetElecGauge() << std::endl;
		std::cout << "�ܿ� ���ͷ� : " << waterGauge << std::endl;
	}
};

int main() {
	HybridWaterCar hwc(10, 20, 30);
	hwc.ShowCurrentGauge();
	return 0;
}