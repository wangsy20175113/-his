const login = r => require.ensure([], () => r(require('@/pages/Login/Login')), 'login')
const Home = r => require.ensure([], () => r(require('@/pages/Home/Home')), 'Home')
const Main = r => require.ensure([], () => r(require('@/pages/Main/Main')), 'Main')
const Admin = r => require.ensure([], () => r(require('@/pages/Admin/Admin')), 'Admin')
const UserAdmin = r => require.ensure([], () => r(require('@/components/admin/UserAdmin/UserAdmin')), 'UserAdmin')
const ScheduleAdmin = r => require.ensure([], () => r(require('@/components/admin/ScheduleAdmin/ScheduleAdmin')), 'ScheduleAdmin')
const RegistrationLevelAdmin = r => require.ensure([], () => r(require('@/components/admin/RegistrationLevelAdmin/RegistrationLevelAdmin')), 'RegistrationLevelAdmin')
const PayMethodAdmin = r => require.ensure([], () => r(require('@/components/admin/PayMethodAdmin/PayMethodAdmin')), 'PayMethodAdmin')
const NonMedicineProjectAdmin = r => require.ensure([], () => r(require('@/components/admin/NonMedicineProjectAdmin/NonMedicineProjectAdmin')), 'NonMedicineProjectAdmin')
const DiagnoseListAdmin = r => require.ensure([], () => r(require('@/components/admin/DiagnoseListAdmin/DiagnoseListAdmin')), 'DiagnoseListAdmin')
const DepartmentAdmin = r => require.ensure([], () => r(require('@/components/admin/DepartmentAdmin/DepartmentAdmin')), 'DepartmentAdmin')
const ArrangementRuleAdmin = r => require.ensure([], () => r(require('@/components/admin/ArrangementRuleAdmin/ArrangementRuleAdmin')), 'ArrangementRuleAdmin')
const OutPatientDoctor = r => require.ensure([], () => r(require('@/pages/OutPatientDoctor/OutPatientDoctor')), 'OutPatientDoctor')
const Cashier = r => require.ensure([], () => r(require('@/pages/Cashier/Cashier')), 'Cashier')
const TechDoctor = r => require.ensure([], () => r(require('@/pages/TechDoctor/TechDoctor')), 'TechDoctor')

const FinicialAdmin = r => require.ensure([], () => r(require('@/pages/FinicialAdmin/FinicialAdmin')), 'FinicialAdmin')
const Dailycheck = r => require.ensure([], () => r(require('@/components/finicialadmin/DailyCheck/DailyCheck')), 'DailyCheck')
const DepartmentWorkloadAnalysis = r => require.ensure([], () => r(require('@/components/finicialadmin/DepartmentWorkloadAnalysis/DepartmentWorkloadAnalysis')), 'DepartmentWorkloadAnalysis')
const PriceAdmin = r => require.ensure([], () => r(require('@/components/finicialadmin/PriceAdmin/PriceAdmin')), 'PriceAdmin')
const UserWorkloadAnalysis = r => require.ensure([], () => r(require('@/components/finicialadmin/UserWorkloadAnalysis/UserWorkloadAnalysis')), 'UserWorkloadAnalysis')


export default [
  {
    path: '/home',
    name: 'Home',
    component: Home,
    redirect: '/home/main',
    children: [
      {
        path: 'main',
        name: 'Main',
        component: Main
      },
      {
        path: 'admin',
        name: 'Admin',
        component: Admin,
        children: [
          {
            path: 'user',
            name: 'User',
            component: UserAdmin
          },
          {
            path: 'schedule',
            name: 'ScheduleAdmin',
            component: ScheduleAdmin
          },
          {
            path: 'registrationlevel',
            name: 'RegistrationLevelAdmin',
            component: RegistrationLevelAdmin
          },
          {
            path: 'paymethod',
            name: 'PayMethodAdmin',
            component: PayMethodAdmin
          },
          {
            path: 'nonmedicineproject',
            name: 'NonMedicineProjectAdmin',
            component: NonMedicineProjectAdmin
          },
          {
            path: 'diagnoselist',
            name: 'DiagnoseListAdmin',
            component: DiagnoseListAdmin
          },
          {
            path: 'department',
            name: 'DepartmentAdmin',
            component: DepartmentAdmin
          },
          {
            path: 'arrangementrule',
            name: 'ArrangementRuleAdmin',
            component: ArrangementRuleAdmin
          }
        ]
      },
      {
        path: 'outpatientdoctor',
        name: 'OutPatientDoctor',
        component: OutPatientDoctor
      },
      {
        path: 'techdoctor',
        name:'TechDoctor',
        component: TechDoctor
      },
      {
        path: 'cashier',
        name: 'Cashier',
        component: Cashier
      },
      {
        path: 'finicialadmin',
        name: 'FinicialAdmin',
        component: FinicialAdmin,
        children: [
          {
            path: 'dailycheck',
            name: 'Dailycheck',
            component: Dailycheck
          },
          {
            path: 'departmentworkloadanalysis',
            name: 'DepartmentWorkloadanalysis',
            component: DepartmentWorkloadAnalysis
          },
          {
            path: 'priceadmin',
            name: 'PriceAdmin',
            component: PriceAdmin
          },{
            path: 'userworkloadanalysis',
            name: 'UserWorkloadAnalysis',
            component: UserWorkloadAnalysis
          }
        ]
      }
    ]
  },
  {
    path: '/login',
    name: 'Login',
    component: login
  }
]
