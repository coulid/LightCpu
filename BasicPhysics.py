class CalVelocity:
    # velocity  = meter/second
    def velocity(self,meter,second):
        return (meter/second,"m/s")
    # second = meter/velocity
    def second(self,Speed,meter):
        return (meter/Speed,"s")
    # meter = velocity*second
    def meter(self,velocity,second):
        return (velocity*second,"m")

class CalAccleration:
    # accleration=velocity/second
    def accleration(self,velocity,second):
        return (velocity/second,"m/s^2")



x=CalVelocity();
print(x.second())

